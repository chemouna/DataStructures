
module BST where

data Tree a = Nil | Node (Tree a) a (Tree a)
                deriving Show


-- data MyTree a = MyEmptyNode | MyFilledNode (MyTree a) a (MyTree a)
--                 deriving Show

