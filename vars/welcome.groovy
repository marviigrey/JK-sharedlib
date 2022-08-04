def call(name){
echo "hey ${name},How are you"

  if ($name == "build"){
  sh "mvn clean package"
  }
}
