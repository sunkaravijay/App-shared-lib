def test(Map config=[:], Closure body={}){
 echo config.command2
 echo 'Testing..'
 bat 'mvn'+' '+config.command2


}
