        class Node {
            int value;
            Node left;
            Node right;

            public Node(int value) {
                this.value = value;
                this.left = null;
                this.right = null;
            }
        }

        class BinaryTree {
            Node root;

            public BinaryTree() {
                this.root = null;
            }

            public int getHeight() {
                return getHeight(root);
            }

            private int getHeight(Node node) {
                if (node == null) {
                    return 0;
                } else {
                    int leftHeight = getHeight(node.left);
                    int rightHeight = getHeight(node.right);

                    return Math.max(leftHeight, rightHeight) + 1;
                }
            }

            public static void main(String[] args) {
                BinaryTree tree = new BinaryTree();

                tree.root = new Node(5);
                tree.root.left = new Node(2);
                tree.root.right = new Node(7);
                tree.root.left.left = new Node(1);
                tree.root.left.right = new Node(4);
                tree.root.right.left = new Node(6);
                tree.root.right.right = new Node(9);

                int height = tree.getHeight();
                System.out.println("BST height " + height);
            }
        }
