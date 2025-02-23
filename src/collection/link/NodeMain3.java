package collection.link;

public class NodeMain3 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기: A - > B -> C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);
        
        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);
        
        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
    }

    private static void add(Node node, String param) {
       Node lastNode = getLastNode(node);
       lastNode.next = new Node(param);
    }

    static Node getNode(Node node, int index) {
        Node x = node;
        // 노드는 다음 노드를 반환하기 때문에
        // 직전 인덱스까지 반복문을 돌려줘야 함
        // 내가 찾는게 2번쨰 인덱스이면 1번째에서 2번째를 반환하니깐
        for(int i = 0; i < index; i++){
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while(x.next != null){
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node) {
        Node x = node;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
