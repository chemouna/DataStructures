
module AVLTree where

data Tree a = Leaf | Node a (Tree a) (Tree a)
  deriving (Show, Eq)

insert :: Ord a => a -> Tree a -> Tree a
insert = undefined

delete :: Ord a => a -> Tree a -> Tree a
delete = undefined

rotate :: Tree a -> Tree a
rotate = undefined

