val lista = 10 :: 2 :: 5 :: 3 :: Nil

def maximo(l : List[Int]) : Option[Int] = l match
  case Nil => None
  //case head :: Nil => Some(head)
  case head :: tail => maximo(l.tail) match
    case None => Some(head)
    case Some(value) => if (value > head) Some(value) else Some(head)

maximo(lista)

//-------------------

