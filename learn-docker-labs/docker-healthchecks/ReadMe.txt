1. docker-compose up, for the above file
2. Installed grafana-ce image from dockerhub for healthchecks using "docker pull grafana/grafana:latest"
3. ran grafana using this command "docker run -itd --name=grafana -p 3000:3000 -v grafana-data:/data -v /var/run/docker.sock:/var/run/docker.sock grafana/grafana"

It uses tones of metric data and a storage for it. We have to find our vms docker deamon to grafana for data collection.