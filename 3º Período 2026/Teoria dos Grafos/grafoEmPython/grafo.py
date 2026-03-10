import networkx as nx
import matplotlib.pyplot as plt
import numpy as np

G = nx.Graph()

nodes_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]

V = list(G.nodes)
print("V = "+str(V))

G.add_edges_from([(1, 2), (2,3), (3,4), (4,5), (5,6), (6,7), (7,8), (8,9), (9,10), (10,11), (11,12), (12,13), (13,14), (14,15), (15,16), (16,1), (17,12), (17,18), (18,4)])

'''IM = nx.incidence_matrix(G).todense()
print(IM)'''


AM = nx.adjacency_matrix(G)
AM.setdiag(AM.diagonal() * 2)
print(AM.todense())

nx.draw(G, with_labels=True)
plt.show()


