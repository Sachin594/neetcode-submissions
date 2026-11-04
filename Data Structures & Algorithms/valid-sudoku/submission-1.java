class Solution {
    public static int getGridKey(int i, int j) {
        int gridKey = 0;
        if (i < 3) {
            if (j < 3) {
                gridKey = 1;
            } else if (j >= 3 && j < 6) {
                gridKey = 2;
            } else {
                gridKey = 3;
            }
        } else if (i >= 3 && i < 6) {
            if (j < 3) {
                gridKey = 4;
            } else if (j >= 3 && j < 6) {
                gridKey = 5;
            } else {
                gridKey = 6;
            }
        } else {
            if (j < 3) {
                gridKey = 7;
            } else if (j >= 3 && j < 6) {
                gridKey = 8;
            } else {
                gridKey = 9;
            }
        }
        return gridKey;
    }

    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        HashMap<Integer, Set<Character>> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int rowKey = i+10;
                int colKey = j+30;
                char item=board[i][j];
                if(item=='.'){
                    continue;
                }
                int gridKey = getGridKey(i, j)+50;
                map.putIfAbsent(gridKey, new HashSet<>());
                map.putIfAbsent(rowKey, new HashSet<>());
                map.putIfAbsent(colKey, new HashSet<>());
                if (map.get(gridKey).contains(item)) {
                    return false;
                }
                else{
                    map.get(gridKey).add(item);
                }
                if (map.get(rowKey).contains(item)) {
                    return false;
                }
                else{
                    map.get(rowKey).add(item);
                }
                if (map.get(colKey).contains(item)) {
                    return false;
                }
                else{
                    map.get(colKey).add(item);
                }
            }
        }
        return true;
    }
}
