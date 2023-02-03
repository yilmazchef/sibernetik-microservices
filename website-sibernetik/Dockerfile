
FROM wordpress:apache

ENV WORDPRESS_DB_HOST=db-sibernetik
ENV WORDPRESS_DB_USER=sibernetik
ENV WORDPRESS_DB_PASSWORD=sibernetik
ENV WORDPRESS_DB_NAME=sibernetik

## COPY ./wp-content /var/www/html/wp-content
COPY ./wp-config.php /var/www/html/wp-config.php
COPY ./wp-config-docker.php /var/www/html/wp-config-docker.php
COPY ./wp-config-local.php /var/www/html/wp-config-local.php

EXPOSE 80
EXPOSE 443

