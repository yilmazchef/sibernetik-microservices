# run discovery-b -> mvn spring-boot:run
# run service-b -> mvn spring-boot:run
# run ui-b -> mvn spring-boot:run

function Start-MySQLOnDocker {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c docker run -p 3000:3306 --name mysql-server -e MYSQL_ROOT_PASSWORD=toor -mysql:latest"
}

function Start-DiscoveryB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn spring-boot:run" -WorkingDirectory .\discovery-b\
}

function Start-ServiceB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn spring-boot:run" -WorkingDirectory .\service-b\
}

function Start-UIB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn spring-boot:run" -WorkingDirectory .\ui-b\
}

Start-MySQLOnDocker
Start-Sleep 10
Start-DiscoveryB
Start-Sleep 10
Start-ServiceB
Start-Sleep 10
Start-UIB
