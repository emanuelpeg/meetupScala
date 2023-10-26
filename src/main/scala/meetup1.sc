val lista = 10 :: 2 :: 5 :: 3 :: Nil

def maximo(l : List[Int]) : Int = l match
  case head :: Nil => head
  case head :: tail => if (l.head > maximo(l.tail)) l.head else maximo(l.tail)

maximo(lista)

//-------------------

