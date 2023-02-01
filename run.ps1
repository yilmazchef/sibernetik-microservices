# run discovery-b -> mvn spring-boot:run
# run service-b -> mvn spring-boot:run
# run ui-b -> mvn spring-boot:run

function Start-DiscoveryB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn clean install && mvn spring-boot:run" -WorkingDirectory .\discovery-b\
}

function Start-ServiceB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn clean install && mvn spring-boot:run" -WorkingDirectory .\service-b\
}

function Start-UIB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn clean install && mvn spring-boot:run" -WorkingDirectory .\ui-b\
}

function Start-DB-B() {
    # run the command in a new process and start mysqld with the --console option and with username: sibernetik and password: sibernetik
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mysqld --console --user=sibernetik --password=sibernetik" -WorkingDirectory .
}

Start-DB-B
Start-Sleep 10
Start-DiscoveryB
Start-Sleep 10
Start-ServiceB
Start-Sleep 10
Start-UIB
