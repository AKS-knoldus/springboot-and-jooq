#!/bin/sh

echo "starting ....."

start_db() {
	sudo service docker start \
	  && sudo docker-compose -f ../docker/db/docker-compose.yml up -d \
	  && sleep 10s \
	  && mysql -h 127.0.0.1 -u root < ../sql/drop-db.sql \
	  && mysql -h 127.0.0.1 -u root < ../sql/create-db.sql \
	  && mysql -h 127.0.0.1 -u root < ../sql/create-db-tables.sql
}

while true; do
    read -p "Proceed? [y/n] " yn
    case $yn in
        [Yy]* ) start_db; break;;
        [Nn]* ) exit;;
        * ) echo "Please answer yes or no.";;
    esac
done