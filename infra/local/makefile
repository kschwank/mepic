.PHONY: local,secrets,stack-deploy,stack-rm

init:
	docker swarm init

secrets:
	read -p "Enter value for mepic_db_user: " DB_USER; \
	printf "$${DB_USER}" | docker secret create mepic_db_user -; \
	read -p "Enter value for mepic_db_pass: " DB_PASS; \
	printf "$${DB_PASS}" | docker secret create mepic_db_pass -;


.DEFAULT_GOAL :=
stack-deploy:
	docker stack deploy -c stack.yml mepic

stack-rm:
	docker stack rm mepic
