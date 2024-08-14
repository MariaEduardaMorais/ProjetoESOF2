# Contruir tudo
$projetos = "AuthServices", "NotificationsServices", "TaskService", "ConfigServer", "DiscoveryServer"

foreach ($projeto in $projetos) {
    Write-Host "Construindo $projeto"
    set-location $projeto
    ./gradlew.bat clean build
    set-location ..
}

# Function that runs build projects base on inputs
# function BuildProjects {
#     param(
#         [string[]]$projects = $projetos
#     )
#
#     foreach ($projeto in $projects) {
#         Write-Host "Construindo $projeto"
#         set-location $projeto
#         ./gradlew.bat clean build
#         set-location ..
#     }
# }