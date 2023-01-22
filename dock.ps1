# mvn spring-boot:build-image -Dspring-boot.build-image.imageName=discovery-b

function Build-DiscoveryB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn spring-boot:build-image -Dspring-boot.build-image.imageName=discovery-b" -WorkingDirectory .\discovery-b\
}

function Build-ServiceB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn spring-boot:build-image -Dspring-boot.build-image.imageName=service-b" -WorkingDirectory .\service-b\
}

function Build-UIB {
    # run the command in a new process
    Start-Process -FilePath "cmd.exe" -ArgumentList "/c mvn spring-boot:build-image -Dspring-boot.build-image.imageName=ui-b" -WorkingDirectory .\ui-b\
}

Build-DiscoveryB
Build-Sleep 10
Build-ServiceB
Build-Sleep 10
Build-UIB
