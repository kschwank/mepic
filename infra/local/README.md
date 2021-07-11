Run `make secrets` to add the secrets to your local docker swarm
Run `make stack-deploy` to deploy the iamsync stack locally
Run `make stack-rm` to remove the iamsync stack locally

All targets require a local docker installation in swarm mode.
You can initialize the swarm mode by running `make init` or
`docker swarm init`.

