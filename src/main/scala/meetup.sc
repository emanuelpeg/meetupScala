val lista = 10 :: 2 :: 5 :: 3 :: Nil

def maximo(l : List[Int]) : Int = if (l.tail.isEmpty) l.head
else if (l.head > maximo(l.tail)) l.head else maximo(l.tail)

maximo(lista)

//-------------------

