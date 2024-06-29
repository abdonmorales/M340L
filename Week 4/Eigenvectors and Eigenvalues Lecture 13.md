# Eigenvectors and Eigenvalues: Lecture 13

Created: June 26, 2024 9:03 AM
Class: M 340L
AI summary: In this lecture on eigenvectors and eigenvalues, we explore the concepts through examples. We start with a simple example involving basis vectors and determine the coordinates of a vector in different bases. Then, we move on to defining eigenvectors and eigenvalues, showcasing examples and finding eigenvectors for a given matrix. The characteristic polynomial and characteristic equation are introduced as well.
Última edición por: Abdon Morales

Here, we continue from the content of yesterday’s lecture. Let’s start with a simple example…
**Example #1**

$$
\underbrace{\Beta}_{\text{Each is a basis for }\real^2} = \{\begin{bmatrix}2\\1\end{bmatrix}, \begin{bmatrix}5\\3\end{bmatrix}\}, C=\{\begin{bmatrix}1\\-1\end{bmatrix}, \begin{bmatrix}3\\4\end{bmatrix}\}
$$

$[\vec{x}]_{C} = \begin{bmatrix}3\\1\end{bmatrix}$, what are $[\vec{x}]_{\Beta}$?

$$
\begin{equation}
[\vec{x}]_{\Beta} = P_{\Beta\leftarrow C}[\vec{x}]_C;\:[P_\Beta|P_C]\xrightarrow{RREF}[I|P_{\Beta\leftarrow C}]
\end{equation}\\
\begin{bmatrix}
2 & 5 &|& 1 & 3\\
1 & 3 &|& -1 & 4\\
\end{bmatrix}\xleftrightarrow{R_1 \text{ swap }R_2}\begin{bmatrix}
1 & 3 &|& -1 & 4\\
2 & 5 &|& 1 & 3\\
\end{bmatrix}\xrightarrow{R_2-2R_1}\begin{bmatrix}
1 & 3 &|& -1 4\\
0 & -1 &|& 3 & -5\\
\end{bmatrix}
$$

---

# Eigenvalues and Eigenvectors

If $A$ is an $n \times n$ matrix, $\vec{v}$ is an **eigenvector**(also know as *characteristic vector(s)*)for $A$ with a corresponding **eigenvalue**(also know as *characteristic value(s)*) $\lambda$, if $\vec{v}$ is a non-zero vector where

$$
\begin{equation}
A\vec{v} = \lambda\vec{v}
\end{equation}
$$

**Example #1**

$$
A = \begin{bmatrix}
5 & 3\\6 & -4
\end{bmatrix} \rightarrow \begin{bmatrix}
5 & 3\\6 & -4
\end{bmatrix}\begin{bmatrix}1\\1\end{bmatrix} = \begin{bmatrix}
5 & 3\\6 & -4
\end{bmatrix} = \begin{bmatrix}
2\\2
\end{bmatrix} = 2\begin{bmatrix}
1\\1
\end{bmatrix}\\
\begin{gather*}
\underbrace{\lambda = 2}_{\text{eigenvalue}}, \underbrace{\vec{v} = \begin{bmatrix}1\\1\end{bmatrix}}_{\text{eigenvector pairs}}
\end{gather*}
$$

***Example #1.1***

Let’s say $\lambda = -1$ is an eigenvalue for $A$, find an eigenvector.

$$
\begin{gather*}
\begin{bmatrix}
5 & -3\\6 & -4
\end{bmatrix}\vec{v} = -1\vec{v} & A\vec{v} = \lambda\vec{v}\\ & A\vec{v}-\lambda\vec{v} = \vec{0}\\ & \xcancel{(A - \lambda)\vec{v} = \vec{0}} \longrightarrow\text{(Not defined)}\\ & (A-\lambda I)\vec{v} = \vec{0}
\end{gather*}\\
\text{The eigenvectors are non-zero solutions to this homogenous system.}\\
\lambda = -1: A-(-1)I = \begin{bmatrix}
5 & -3\\
6 & -4
\end{bmatrix}-(-1)\begin{bmatrix}
1 & 0\\
0 & 1
\end{bmatrix} = \begin{bmatrix}
6 & -3\\
6 & -3
\end{bmatrix}\begin{bmatrix}1\\2\end{bmatrix} = \begin{bmatrix}0\\0\end{bmatrix}\\
\begin{bmatrix}6 & -3\\0 & 0\end{bmatrix}\xrightarrow{\frac{1}{6}R_1}\begin{bmatrix}1 & -\frac{1}{2}\\0 & 0\end{bmatrix} \rightarrow \begin{align*}x_2 &= s\\x_1 - \frac{1}{2}x_2 &= 0\end{align*}\;\; \begin{bmatrix}x_1\\x_2\end{bmatrix}=\begin{bmatrix}\frac{1}{2}s\\s\end{bmatrix}=s\begin{bmatrix}-0.5\\1\end{bmatrix}
$$

$(A-\lambda I)\vec{v}=\vec{0}$, $\lambda$ is an eigenvalue when this equation has non-trivial solutions

$$
\begin{align}
\iff& A-\lambda I \;\text{has a free variable}\\
\iff& A-\lambda I \;\text{is singular}\\
\iff& \det({\underbrace{A-\lambda I}_{\text{chracteristic polynomial}}}=0) \;\text{[charateristic equation]}
\end{align}
$$

The trace $A$, $tr{A} = \sum_{n}^{i=1} a_{ii} \lor \sum_{n}^{i = 1} \lambda_{i}$ (including multiplicities), $\det{A} = \prod_{n}^{i = 1} \lambda_i$ (including multiplicities).

***Example #1.2***

$$
\begin{gather*}
A = \begin{bmatrix}
7 & 6\\
-3 & 2
\end{bmatrix} & \begin{align*}
0 &= \det({A-\lambda I})\\
&=\det{\begin{bmatrix}
7 & -\lambda\\
-3 & -2-\lambda
\end{bmatrix}}
\end{align*}&
\begin{align*}
0 &= (7-\lambda)(-2-\lambda)-6(-3)\\
0 &= \lambda^2-7\lambda+2\lambda-14 + 18\\
0 &= \lambda^2-5\lambda + 4 = (\lambda-1)(\lambda-4)\\
\lambda &= [1, 4]
\end{align*}
\end{gather*}\\
A = \begin{bmatrix}
7 & 6\\
-3 & -2
\end{bmatrix} \; \lambda = 1, 4;\;\lambda = 1:A-1I=\begin{bmatrix}
6 & 6\\-3 & -3
\end{bmatrix}\begin{bmatrix}-1\\1\end{bmatrix} = \begin{bmatrix}
0\\0
\end{bmatrix}
$$

| Def: | $\lambda = 4: A-4I =$ |
| --- | --- |
| $\begin{bmatrix}
a & b\\c & d
\end{bmatrix}\begin{bmatrix}-b\\a\end{bmatrix}(\lor \begin{bmatrix}-d\\c\end{bmatrix}) = \begin{bmatrix}0\\0\end{bmatrix}$ | $\lambda = 1: \vec{v} = \begin{bmatrix}-1\\1\end{bmatrix};\;\lambda = 4, \vec{v}=\begin{bmatrix}-2\\1\end{bmatrix}$ |