package com.text.gogglesheet.SpreadSheet;
import React, { useState } from "react";
import DataGrid from "react-data-grid";
import axios from "axios";

public class Js {
    const rows = new Array(10).fill(null).map((_, index) => ({
        id: index,
                A: "",
                B: "",
                C: "",
                D: "",
    }));

    export default function Spreadsheet() {
  const [data, setData] = useState(rows);

  const handleCellEdit = async ({ index, column, value }) => {
    const updatedRows = [...data];
        updatedRows[index][column] = value;
        setData(updatedRows);

        try {
            await axios.post("http://localhost:8080/api/updateCell", {
                    rowIndex: index,
                    column: column,
                    value: value,
      });
        } catch (error) {
            console.error("Error updating cell:", error);
        }
  };

  const columns = [
        { key: "A", name: "A", editable: true },
        { key: "B", name: "B", editable: true },
        { key: "C", name: "C", editable: true },
        { key: "D", name: "D", editable: true },
  ];
  return (
                <div className="p-4">
                <h2 className="text-xl font-bold mb-2">Google Sheets Clone</h2>
                <DataGrid
        columns={columns}
        rows={data}
        rowKeyGetter={(row) => row.id}
        onCellEditCommit={handleCellEdit}
                />
                </div>
  );
    }
}
