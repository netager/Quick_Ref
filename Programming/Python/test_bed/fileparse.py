<<<<<<< HEAD
# fileparse.py
=======
#fileparse.py

>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b
import csv

def parse_csv(lines, select=None, types=None, has_headers=True, delimiter=',', silence_errors=False):
    '''
<<<<<<< HEAD
    Parse a CSV file into a list of records with type conversion.
    '''
    if select and not has_headers:
        raise RuntimeError('select requires column headers')

    rows = csv.reader(lines, delimiter=delimiter)

    # Read the file headers (if any)
    headers = next(rows) if has_headers else []

    # If specific columns have been selected, make indices for filtering and set output columns
    if select:
        indices = [ headers.index(colname) for colname in select ]
        headers = select

    records = []
    for rowno, row in enumerate(rows, 1):
        if not row:     # Skip rows with no data
            continue

        # If specific column indices are selected, pick them out
        if select:
            row = [ row[index] for index in indices]

        # Apply type conversion to the row
        if types:
            try:
                row = [func(val) for func, val in zip(types, row)]
=======
    Parse a CSV file into a list of records with type conveersion.
    ''' 
    if select and not has_headers:
        raise RuntimeError('select requires column headers')
    
    rows = csv.reader(lines, delimiter=delimiter)
    
    # Read the file headers (if any)
    headers = next(rows) if has_headers else []
    
    
    # If specific columns have been selected, make indices for filtering and set output columns
    if select:
        indices = [headers.index(colname) for colname in select]
        headers = select
    
    records = []

    for rowno, row in enumerate(rows, 1):
        if not row:
            continue
           
        # If specific column indices are selected, pick them out
        if select:
            row = [ row[index] for index in indices ]
    
        # Apply type conversion to the row
        if types:
            try:
                row = [ func(val) for func, val in zip(types, row) ]
>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b
            except ValueError as e:
                if not silence_errors:
                    print(f"Row {rowno}: Couldn't convert {row}")
                    print(f"Row {rowno}: Reason {e}")
                continue
<<<<<<< HEAD

        # Make a dictionary or a tuple
        if headers:
=======
    
        # Make a dictionary or a tuple
        if headers:    
>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b
            record = dict(zip(headers, row))
        else:
            record = tuple(row)
        records.append(record)
<<<<<<< HEAD

    return records
=======
            
    return records
>>>>>>> 1b27a3f2ed2fb39c7c019d9d350c38ff09ce819b
