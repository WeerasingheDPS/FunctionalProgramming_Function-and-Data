//19001861
object Q4 extends App{

  val acc1= new Bankacc("Dulanjana",19186,-1500.00)
  val acc2= new Bankacc("Santha",19135,-3900.00)
  val acc3= new Bankacc("Sadeepa",19131,7000.00)
  val acc4= new Bankacc("Asitha",19104,4900.00)

  var bank:List[Bankacc]=List(acc1,acc2,acc3,acc4)

  val overdraft = bank.filter(x=>x.balance<0)
  val balance = bank.map((x)=>(x.balance)).reduce((x,y)=>(x+y))
  val interest = (b:List[Bankacc])=>b.map((x) => (x.nic,x.accnumber,if(x.balance>0)  (x.balance+(x.balance*0.5)) else (x.balance+(x.balance*0.1)) ))


  print("The accounts with negative balance:")
  println(overdraft)
  print("The sum of all accounts:")
  println(balance)
  print("The final balnce of all accounts:")
  println(interest(bank))

}

class Bankacc(id:String,an:Int,b:Double){

  var nic:String=id
  var accnumber:Int =an
  var balance:Double =b

  override def toString = "["+nic+":"+accnumber+":"+balance+"]"

}