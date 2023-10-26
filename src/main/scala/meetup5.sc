val lista = 10 :: 2 :: 5 :: 3 :: Nil

def buscar(l : List[Int], fx : (Int, Int) => Boolean) : Option[Int] = l match
  case Nil => None
  case head :: Nil => Some(head)
  case head :: tail => buscar(l.tail, fx).map(value => if (fx(value, head)) value else head)

def menor(a: Int, b: Int) = a < b
def mayor(a: Int, b: Int) = a > b

def minimo(l : List[Int]) : Option[Int] = buscar(l, menor)

def maximo(l : List[Int]) : Option[Int] = buscar(l, mayor)

maximo(lista)
maximo(Nil)
minimo(lista)
minimo(Nil)
//-------------------

