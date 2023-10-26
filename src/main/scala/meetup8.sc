val lista = 10 :: 2 :: 5 :: 3 :: Nil

def buscar[T](l : List[T], fx : (T, T) => Boolean) : Option[T] = l match
  case Nil => None
  case head :: Nil => Some(head)
  case head :: tail => buscar(l.tail, fx).map(value => if (fx(value, head)) value else head)

def minimo[T](l : List[T])(implicit ord: Ordering[T]) : Option[T] = buscar[T](l, ord.lt(_,_))
def maximo[T](l : List[T])(implicit ord: Ordering[T]) : Option[T] = buscar[T](l, ord.gt(_,_))

maximo(lista)
minimo(lista)

val names = "Juan" :: "Pedro" :: "Antonio" :: Nil
maximo(names)
minimo(names)
//-------------------

