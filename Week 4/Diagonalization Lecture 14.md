# Diagonalization: Lecture 14

Created: June 28, 2024 10:58 AM
Class: M 340L
AI summary: This document discusses diagonalization and provides examples. It covers important definitions, theorems, and proofs related to diagonalization. The examples demonstrate the process of finding eigenvalues, eigenvectors, and diagonalizing matrices. The document also mentions the conditions for a matrix to be diagonalizable and provides an example of a matrix that is not diagonalizable.
Última edición por: Abdon Morales

**Introduction Example**

Some important definitions need for this examples

$$
\begin{gather}
A\vec{v} = \lambda \vec{v}\\
(A-\lambda I)\vec{v}=\vec{0}
\end{gather}
$$

$$
\begin{gather*}
A=\begin{bmatrix}3 & 2 & 4\\
4 & 5 & 8\\
-8 & 0 & -5\end{bmatrix} & \lambda = -1, 1, 3
\end{gather*}\\
\lambda = -1: A-(-1)I = \begin{bmatrix}
4 & 2 & 4\\4 & 6 & 8\\-8 & 0 & -4
\end{bmatrix}\begin{bmatrix}
-1\\-2\\2
\end{bmatrix}=\begin{bmatrix}
0\\0\\0
\end{bmatrix}\\
\begin{bmatrix}
4 & 2 & 4\\4 & 6 & 8\\-8 & 0 & -4
\end{bmatrix}\xrightarrow[R_3 + 2R_1]{R_2 - R_1}\begin{bmatrix}
4 & 2 & 4\\0 & 4 & 4\\0 & 4 & 4
\end{bmatrix}\xrightarrow{\frac{1}{4}R_2}\begin{bmatrix}
4 & 2 & 4\\0 & 1 & 1\\0 & 4 & 4
\end{bmatrix}\xrightarrow[R_3-4R_2]{R_1-2R_2}\\\begin{bmatrix}
4 & 0 & 2\\ 0 & 1 & 1\\ 0 & 0 & 0
\end{bmatrix}\xrightarrow{\frac{1}{4}R_1}\begin{bmatrix}
1 & 0 & \frac{1}{2}\\0 & 1 & 1\\0 & 0 & 0
\end{bmatrix}\iff \vec{x} = s\begin{bmatrix}-\frac{1}{2}\\-1\\1\end{bmatrix}
$$

Below are the operations done to get our eigenvectors and eigenvalues from this example:

$$
\lambda = 1; A - 1I=\begin{bmatrix}
2 & 2 & 4\\4 & 4 & 8\\-8 & 0 & -6
\end{bmatrix}\begin{bmatrix}
-3\\-5\\4
\end{bmatrix}=\begin{bmatrix}
0\\0\\0
\end{bmatrix}
$$

$$
\lambda = 3; A - 3I=\begin{bmatrix}
0 & 2 & 4\\4 & 2 & 8\\-8 & 0 & -8
\end{bmatrix}\begin{bmatrix}
-1\\-2\\1
\end{bmatrix}=\begin{bmatrix}
0\\0\\0
\end{bmatrix}
$$

$\lambda_1 = -1, \vec{v}_1 = \begin{bmatrix}-1\\-2\\2\end{bmatrix}; \lambda_2 = 1, \vec{v}_2 = \begin{bmatrix}-3\\-5\\4\end{bmatrix}; \lambda_3 = 3, \vec{v}_3 = \begin{bmatrix}-1\\-2\\1\end{bmatrix}$.

---

**Theorem**:

For a matrix $A$, eigenvectors for different eigenvalues are linearly independent.

**Proof:**

Let $\{\vec{v}_1, \vec{v}_2, …, \vec{v}_k\}$ be a set of eigenvectors for $A$ with corresponding eigenvalues $\{\lambda_1, \lambda_2, …, \lambda_k\}$, and $\lambda_i \neq \lambda_j$ if $i \neq j$. Assume this set of vectors is linearly dependent (***and we will arrive at a contradiction***).
So for some $l$, $\{\vec{v}_1, …, \vec{v}_l\}$ is linearly independent but $\{\vec{v}_1, …, \vec{v}_{l+1}\}$ is linearly independent; $\therefore \vec{0} = c_1\vec{v}_1 + c_2\vec{v}_2 +…+c_l\vec{v}_l + c_{l + 1}\vec{v}_{l + 1}$ (this is denoted as ***mtrxA***) where at least one $c \neq 0$.

**Multiply** $\text{mtrx}A$ **by** $A$,

$$
\begin{align}
A \cdot \vec{0} &= A(c_1\vec{v}_1 + ... + c_{l + 1}\vec{v}_{l + 1})\\
\vec{0} &= c_1A\vec{v}_1 + ... + c_{l + 1}A\vec{v}_{l + 1}\\
\vec{0} &= c_{1}\lambda_1\vec{v}_1 + ... + c_{l + 1}\lambda_{l + 1}\vec{v}_{l + 1}
\end{align}
$$

**Multiply** $\text{mtrx}A$ **by** $\lambda_{l + 1}$

$$
\vec{0} = c_1\lambda_{l + 1}\vec{v}_1 + c_2\lambda_{l + 1}\vec{v}_2 + ... + c_{l}\lambda_{l + 1}\vec{v}_l + c_{l+1}\lambda_{l +1}\vec{v}_{l + 1}
$$

Subtract these last two equations:

$$
\vec{0} = c_1(\lambda_1-\lambda_{l + 1})\vec{v}_1 + c_2(\lambda_2-\lambda_{l + 1})\vec{v}_2 + ...\\ + c_l(\lambda_l-\lambda_{l + 1})\vec{v}_1
$$

Since $\{\vec{v}_1, …, \vec{v}_l\}$ are independent, $c_i(\lambda_i-\lambda_{l + 1}) = 0$; since $\lambda_i \neq \lambda_j$ for $i \neq j$, $\lambda_i-\lambda_{l + 1} \neq 0$, so $c_i = 0$ for all $i$. This then force $c_{l + 1}=0$, which contradicts the assumption that $\{\vec{v}_1, …, \vec{v}_{l + 1}\}$ was linearly dependent; this proves the result by contradiction**.**

---

**Example #1**

$$
\begin{gather*}
A = \begin{bmatrix}
3 & 2 & 4\\4 & 5 & 8\\-8 & 0 & -5
\end{bmatrix} & \lambda_1 = -1, \vec{v}_1 = \begin{bmatrix}
-1\\-2\\2
\end{bmatrix}; \lambda_2 = 1, \vec{v}_2 = \begin{bmatrix}
-3\\-5\\4
\end{bmatrix};\\ & \lambda_3 = 3, \vec{v}_3 = \begin{bmatrix}
-1\\-2\\1
\end{bmatrix}
\end{gather*}\\
\begin{gather*}
P = [\vec{v}_1, \vec{v}_2, \vec{v}_3] = \begin{bmatrix}
-1 & -3 & -1\\-2 & -5 & -2\\2 & 4 & 1
\end{bmatrix} & A = \underbrace{PDP^{-1}}_{\text{diagonalization of } A\downarrow}\\
D = \begin{bmatrix}
\lambda_1 & 0 & 0\\
0 & \lambda_2 & 0\\
0 & 0 & \lambda_3\\
\end{bmatrix} = \begin{bmatrix}
-1 & 0 & 0\\
0 & 1 & 0\\
0 & 0 & 3
\end{bmatrix} & AP = PD
\end{gather*}
$$

$$
\text{Here are some important defintion equations for diagonalization}\\
\begin{align}
AP &= A[\vec{v}_1, \vec{v}_2, \vec{v}_3] = [A\vec{v}_1, A\vec{v}_2, A\vec{v}_3]\\
&= [\lambda_1\vec{v}_1, \lambda_2\vec{v}_2, \lambda_3\vec{v}_3]\\
PD &= [\vec{v}_1, \vec{v}_2, \vec{v}_3]\begin{bmatrix}
\lambda_1 & 0 & 0\\0 & \lambda_2 & 0\\0 & 0 & \lambda_3
\end{bmatrix} = [\lambda_1\vec{v}_1, \lambda_2\vec{v}_2, \lambda_3\vec{v}_3]
\end{align}\\
\begin{gather}
A = PDP^{-1} &\leftarrow A\vec{v}=\lambda\vec{v}\;
\end{gather}
$$

With these definitions out of the way, time for us to complete example

$$
\begin{align*}
\begin{bmatrix}
3 & 0 & 0\\0 & 2 & 0\\0 & 0 & -1
\end{bmatrix}\begin{bmatrix}
1 & 2 & 3\\4 & 5 & 6\\7 & 8 & 9
\end{bmatrix} &= \begin{bmatrix}
3 & 6 & 9\\8 & 10 & 12\\-7 & -8 & -9
\end{bmatrix}\\
\begin{bmatrix}
1 & 2 & 3\\4 & 5 & 6\\7 & 8 & 9
\end{bmatrix}\begin{bmatrix}
3 & 0 & 0\\0 & 2 & 0\\0 & 0 & -1
\end{bmatrix} &= \begin{bmatrix}
3 & 4 & -3\\12 & 10 & -6\\21 & 16 & -9
\end{bmatrix}
\end{align*}
$$

**Example #2**

$$
\begin{gather*}
A = \begin{bmatrix}
-1 & -1 & -1\\4 & 3 & 2\\-2 & -1 & 0
\end{bmatrix} & \lambda = \underbrace{0}_{\text{simple root}}, \underbrace{1}_{\text{double root}} & \lambda^{(0)} (\lambda - 1)^{(2)} = 0
\end{gather*}\\
\begin{align*}
\lambda &= 0: A-0I = \begin{bmatrix}
-1 & -1 & -1\\4 & 3 & 2\\-2 & -1 & 0
\end{bmatrix}\begin{bmatrix}
-1\\2\\-1
\end{bmatrix} = \begin{bmatrix}
0\\0\\0
\end{bmatrix}\\
\lambda &= 1: A - 1I = \begin{bmatrix}
-2 & -1 & -1\\4 & 2 & 2\\-2 & -1 & -1
\end{bmatrix}\xrightarrow{RREF}\begin{bmatrix}
1 & \frac{1}{2} & \frac{1}{2}\\0 & 0 & 0\\0 & 0 & 0
\end{bmatrix}\\
\vec{x} &= \underbrace{s\begin{bmatrix}
-\frac{1}{2}\\1\\0
\end{bmatrix} + t \underbrace{\begin{bmatrix}
-\frac{1}{2}\\0\\1
\end{bmatrix}}_{\text{eigenspace for }\lambda = 1}}_{\text{eigenvectors}}\\
\begin{equation*}
\begin{bmatrix}-1\\1\\1\end{bmatrix}, \begin{bmatrix}0\\-1\\1\end{bmatrix}, \begin{bmatrix}-1\\2\\0\end{bmatrix}, \begin{bmatrix}-1\\0\\2\end{bmatrix}
\end{equation*}\\
\vec{v}&= \begin{bmatrix}
-1\\2\\0
\end{bmatrix}, \begin{bmatrix}
-1\\0\\2
\end{bmatrix}\\
A = \begin{bmatrix}
-1 & -1 & -1\\4 & 3 & 2\\-2 & -1 & 0
\end{bmatrix} & \lambda=0, \vec{v} = \begin{bmatrix}
-1\\2\\-1
\end{bmatrix}; \lambda =1, \vec{v} = \begin{bmatrix}
1\\2\\0
\end{bmatrix},\begin{bmatrix}-1\\0\\2\end{bmatrix}
\end{align*}
$$

The number of eigenvectors for a given $\lambda=$ the number of free variables in $A-\lambda I$.

$$
A = PDP^{-1}=\begin{bmatrix}
-1 & -1 & -1\\2 & 2 & 0\\-1 & 0 & 2
\end{bmatrix}\begin{bmatrix}
0 & 0 & 0\\0 & 1 & 0\\0 & 0 & 1
\end{bmatrix}P^{-1}
$$

**Example #3**

$$
\begin{gather*}
A = \begin{bmatrix}
3 & 1 & -2\\1 & 1 & -1\\3 & 1 & -2
\end{bmatrix} & \lambda = 0 \:\:\text{(Simple root)}\\
& \lambda = 1\:\:\text{(Double root)}
\end{gather*}\\
\begin{align*}
\lambda &= 0: A-0I=\begin{bmatrix}
3 & 1 & -2\\1 & 1 & -1\\3 & 1 & -2
\end{bmatrix}\xrightarrow{R_1 -R_2}\begin{bmatrix}
2 & 0 & -1\\1 & 1 & -1\\3 & 1 & -2
\end{bmatrix}\begin{bmatrix}
1\\1\\2
\end{bmatrix} = \begin{bmatrix}0\\0\\0\end{bmatrix}\\
\lambda &=1:A-1I = \begin{bmatrix}2 & 1 & -2\\1 & 0 & -1\\3 & 1 & -3\end{bmatrix}\begin{bmatrix}
1\\0\\1
\end{bmatrix} = \begin{bmatrix}0\\0\\0\end{bmatrix}
\end{align*}
$$

$A$ has only 2 eigenvectors → $A$ is **NOT diagonalizable**
$A$ is diagonalizable $\iff$there is a basis for $\reals^n$ consisting of eigenvectors of $A$. The algebraic multiplicity of an eigenvalue = multiplicity of $\lambda$ in the characteristic equation; geometric multiplicity = dimension of the eigenspace for $\lambda$. (number of free variables in $A-\lambda I$). $A$ is diagonalizable $\iff$algebraic multiplicity = geometric multiplicity for every $\lambda$.

$$
1 \leq \text{geometric multiplicity}\leq \text{algebraic multiplicity}
$$

**Example #4**

$$
(\lambda + 3)(\lambda - 1)^3(\lambda + 4)(\lambda -7)^2 = 0\\ \text{multiplicity of }\lambda = -3, -4 \text{ are }1.\\ \text{Multiplicity of } \lambda = 1 \text{ is }3\\\text{Multiplicity of } \lambda = 7 \text{ is }2
$$