![img.png](uml/uml.png)

- Customers can buy CDs, searching on the title and the artist.
- Record labels send batches of CDs to the warehouse.
- Customers can only order titles that are in stock

### Testing

- Buy a CD
  - CD is in stock: `stock count is reduced by quantity`
  - Insufficient stock: `throw an exception`
- Search for a CD
  - It's in catalogue: `return the CD info`
  - No match: `return nothing`
  - Multiple matchs: `return list`
- Receive stock from a label
  - Single title that's in catalogue: `add copies to that CD's stock`
  - Not in catalogue: `add it, and add copies to stock`
  - Multiple CDs: `any new CDs added to catalogue, and stock added to each CD`
