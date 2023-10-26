val lista = 10 :: 2 :: 5 :: 3 :: Nil

def minimo(l : List[Int]) : Option[Int] = l match
  case Nil => None
  case head :: Nil => Some(head)
  case head :: tail => minimo(l.tail).map(value => if (value < head) value else head)

def maximo(l : List[Int]) : Option[Int] = l match
  case Nil => None
  case head :: Nil => Some(head)
  case head :: tail => maximo(l.tail).map(value => if (value > head) value else head)

maximo(lista)
maximo(Nil)
minimo(lista)
minimo(Nil)
//-------------------

