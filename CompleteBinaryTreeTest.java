import tree.CompleteBinaryTree;

public class CompleteBinaryTreeTest {

	public static void main(String[] args) {
		int size = 9;
		CompleteBinaryTree<Character> tree = new CompleteBinaryTree<>(size);
		for (int i = 0; i < size; i++) {
			tree.add((char)('a'+i));
		}
		
		tree.preOrder(1);
		System.out.println(); //현재 노드 방문
		tree.inOrder(1); //왼쪽 서브트리 방문
		System.out.println();
		tree.postOrder(1);//오른쪽 서브트리 방문
//		System.out.println();
	}

}
