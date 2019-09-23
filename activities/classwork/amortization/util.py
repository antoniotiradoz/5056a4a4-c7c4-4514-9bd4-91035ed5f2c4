import pandas as pd
import matplotlib.pyplot as plt


class Amortization(object):

    def __init__(self, amount, interest, n):
        self.amount = amount
        self.interest = interest
        self.n = n

    def annuity(self):
        pass

    def get_table(self):
        """Create a pandas dataframe representing the amortization table."""
        pass

    def get_plot(self):
        """Create a plot (fig) to visualize at least two variables from the amortization table."""
        pass
