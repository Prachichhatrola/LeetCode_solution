class Solution {
    public int[][] transpose(int[][] originalMatrix) {
        int rows = originalMatrix.length;
        int cols = originalMatrix[0].length;
        // Original matrix is MxN but the transposed matrix will be NxM 
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }
        
        return transposedMatrix;
    }
}
