# How determinants interact with elementary row operations: Lecture 12

Created: June 25, 2024 1:40 PM
Class: M 340L
AI summary: This document discusses determinants and their interactions with elementary row operations. It provides examples of swapping rows, multiplying rows by a number, and replacing rows with the sum of another row and a multiple. It also explores the determinant of the transpose of a matrix and the determinant of matrix products. The document concludes with a discussion on bases and coordinates relative to a basis.
Última edición por: Abdon Morales

$$
A = \begin{bmatrix}
2&1&1&2&1&1\\
0&1&1&1&-2&1\\
0&1&1&3&2&3\\
4&1&3&1&5&8\\
-2&2&1&3&5&6\\
0&1&0&3&0&-1\\
\end{bmatrix}
$$

1. If you swap two rows, the determinant is multiplied by -1.
2. If you multiply a row by a number, you multiply the determinant by that number.
3. If you replace a row by the sum of that row and a multiple of another row, the determinant does not change.

$$
\det{\begin{bmatrix}
1 & 2\\
3 & 4
\end{bmatrix}} = (1 \times 4)-2\times 3 = -2
$$

Then swap $R_1 \:\text{and}\: R_3$,

$$
\det{\begin{bmatrix}
3 & 4\\
1&2
\end{bmatrix} = (3 \times 2) - (4 \times 1) = 2}
$$

Then multiply $R_1 \:\text{and}\: R_2$,

$$
\det{\begin{bmatrix}
2 & 4\\
3 & 4
\end{bmatrix} = 2 \times 4 - 4\times 3 = -4}
$$

Then replace $R_2$ by $R_2 - 3R_1$,

$$
\det{\begin{bmatrix}
1 & 2\\
0 & -2
\end{bmatrix} = -2}
$$

We can also get the determinant of $A$, by getting the determinant of the transpose of $A^T$, and vice versa can be applied.

$$
\begin{equation}
\det A^T=\det A
\end{equation}
$$

Here’s another example of using determinants for solving the initial matrix in the beginning of these notes.

**Example #1**

$$
\det{\begin{bmatrix}
2 & 1 & 0 & 2\\
0 & 1 & 3 & -1\\
-2 & 0 & 6 & -2\\
4 & 2 & 3 & 7
\end{bmatrix}}\xrightarrow[R_4-R_2]{R_3 - 2R_2}
\det{\begin{bmatrix}
2 & 1 & 0 & 2\\
0 & 1 & 3 & -1\\
-2 & -2 & 0 & 0\\
4 & 1 & 0 & 8
\end{bmatrix}}\\=3(-1)\det{\begin{bmatrix}
2 & 1 & 2\\
-2 & -2 & 0\\
4 & 1 & 8
\end{bmatrix}}=3(-1)(-2)\det{\begin{bmatrix}
2 & 1 & -2\\
1 & 1 & 0\\
4 & 1 & 8
\end{bmatrix}}\\\longrightarrow 6\det{\begin{bmatrix}
2 & 1 & 2\\
1 & 1 & 0\\
4 & 1 & 8
\end{bmatrix}}\xrightarrow{R_3-4R_1} 12 \det{\begin{bmatrix}
2 & 1 & 1\\
1 & 1 & 0\\
-4 & -3 & 8
\end{bmatrix}}\\=12\times 1(+1)\det{\begin{bmatrix}
1 & 1\\
-4 & -3
\end{bmatrix}} = 12
$$

**Example #2**

$$
\det{\begin{bmatrix}
2&1&1&2&1&1\\
0&1&1&1&-2&1\\
0&1&1&3&2&3\\
4&1&3&1&5&8\\
-2&2&1&3&5&6\\
0&1&0&3&0&-1\\
\end{bmatrix}}\xrightarrow[R_5 + R_1]{R_4-2R_1} \det{\begin{bmatrix}
2&1&1&2&1&1\\
0&1&1&1&-2&1\\
0&1&1&3&2&3\\
0&-1&1&-3&3&6\\
0&3&2&5&6&7\\
0&1&0&3&0&-1\\
\end{bmatrix}}=\\
2\det{\begin{bmatrix}
1&1&1&-2&1\\
1&1&3&2&3\\
-1&1&-3&3&6\\
3&2&5&6&7\\
1&0&3&0&-1\\
\end{bmatrix}}\xrightarrow[R_4-2R_1]{R_2-R_1 \:\text{and}\: R_3-R_1}
$$

Another important equation for using determinants is with matrix products such as below:

$$
\det({AB})=\det{A}\times \det{B}
$$

Here’s an example of using determinants for matrix products:
**Examples #3**

$$
A=\begin{bmatrix}
1 & 2\\
3 & 4
\end{bmatrix},\:B=\begin{bmatrix}
0 & 1\\
-2 & 3
\end{bmatrix};\:AB=\begin{bmatrix}
-4 & 7\\
-8 & 15
\end{bmatrix}\\
\det{A} = -2, \: \det{B}=2; \det{AB} = -4(15)-(-8)7 = -60 + 56 = 4
$$

So if $A$ is invertible, $AA^{-1}=I$, $I = \det{I}=\det({AA^{-1}}) = \det{A}\times \det{A^{-1}}$.

$$
\text{The determinant of the inverse of A matrix is also } \frac{1}{\det{A}}.
$$

A **basis** for a space is a linearly independent spanning set of $A$.

$$
\begin{align*}
H &= \text{space}\\
\Beta &= \{\vec{b}_1, \vec{b}_2,..., \vec{b}_n\} \leftarrow \text{Basis for H and an ordered set}
\end{align*}\\
\text{If }\vec{x}\in H\text{, there exists $\beta_1, \beta_2, ..., \beta_n$ such that}\\
\begin{equation*}
\vec{x} = \beta_1b_1+\beta_2b_2+...+\beta_nb_n
\end{equation*},\\ \text{and these $\beta$'s are \underline{unique}.}

$$

The coordinates of $\vec{x}$ are relative to the $\Beta$ basis are:

$$
[x]_{\Beta} = \begin{bmatrix}
\beta_1\\
\beta_2\\
...\\
\beta_n
\end{bmatrix}
$$

**Example #4**

$$
\begin{align*}
\begin{bmatrix}
2\\
-3
\end{bmatrix} &= 2\begin{bmatrix}
1\\
0
\end{bmatrix} + (-3)\begin{bmatrix}
0\\
1
\end{bmatrix}\\
&=2\vec{e}_1-3\vec{e}_2 \lor 2\hat{i}-3\hat{j}
\end{align*}
$$