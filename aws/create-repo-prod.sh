# creazione del repository che conterrà l'immagine
aws ecr create-repository --repository-name thor/intcomdata-prod --tags Key=owner,Value=picN38pL9 --profile edison-prod
