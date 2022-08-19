def call(stageName){

echo "hey ${stageName},How are you"
}
  if ("${stageName}" == "build")
  {
  sh "mvn clean package"
  }
  else if ("${stageName}" == "Sonarqube Report")
  {
  sh "mvn sonar:sonar"
  }
  else if ("${stgeName}" == "upload")
  {
   sh "mvn deploy 
  }
}
