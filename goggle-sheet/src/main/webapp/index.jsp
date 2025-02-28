import { Button } from "@/components/ui/button";
import { Card, CardContent } from "@/components/ui/card";
import { motion } from "framer-motion";
import { useState, useEffect } from "react";

export default function IndexPage() {
  const initialData = [
    ["Name", "Age", "City", "Occupation"],
    ["Alice Brown", "30", "San Francisco", "Engineer"],
    ["Bob Johnson", "25", "Chicago", "Designer"],
  ];

  const [spreadsheetData, setSpreadsheetData] = useState([]);
  const [currentIndex, setCurrentIndex] = useState(0);
  const [selectedRow, setSelectedRow] = useState(null);

  useEffect(() => {
    if (currentIndex < initialData.length) {
      const timeout = setTimeout(() => {
        setSpreadsheetData((prevData) => [...prevData, initialData[currentIndex]]);
        setCurrentIndex((prevIndex) => prevIndex + 1);
      }, 1000);
      return () => clearTimeout(timeout);
    }
  }, [currentIndex]);

  return (
    <div className="min-h-screen bg-gradient-to-br from-teal-900 to-blue-600 text-white flex flex-col items-center overflow-hidden">
      {/* Navbar */}
      <motion.nav className="w-full p-4 bg-teal-800 shadow-lg flex justify-between items-center"
        initial={{ opacity: 0, y: -20 }}
        animate={{ opacity: 1, y: 0 }}>
        <h1 className="text-3xl font-extrabold text-orange-400">SheetPro</h1>
        <div>
          <Button variant="outline" className="mr-2 border-orange-400 text-orange-300">Login</Button>
          <Button className="bg-orange-500 hover:bg-orange-600">Get Started</Button>
        </div>
      </motion.nav>

      {/* Hero Section */}
      <motion.section className="text-center py-24 px-6 max-w-4xl"
        initial={{ opacity: 0, scale: 0.9 }}
        animate={{ opacity: 1, scale: 1 }}>
        <h2 className="text-6xl font-extrabold mb-4 text-orange-300">Effortless Data Management</h2>
        <p className="text-xl text-orange-200 mb-6">
          Experience a seamless, intuitive spreadsheet tool designed to boost your productivity.
        </p>
        <Button size="lg" className="bg-orange-500 hover:bg-orange-600 px-6 py-3 text-lg">Start Now</Button>
      </motion.section>

      {/* Spreadsheet Demo */}
      <motion.section className="text-center py-16 w-full px-6 bg-teal-800 rounded-xl shadow-lg"
        initial={{ opacity: 0, y: 50 }}
        animate={{ opacity: 1, y: 0 }}>
        <h3 className="text-4xl font-bold text-orange-400 mb-6">Live Spreadsheet Preview</h3>
        <div className="overflow-auto border border-orange-600 p-6 bg-teal-900 rounded-xl shadow-lg inline-block">
          <table className="border-collapse w-full text-white">
            <tbody>
              {spreadsheetData.map((row, rowIndex) => (
                <motion.tr key={rowIndex} className="cursor-pointer hover:bg-teal-700" onClick={() => setSelectedRow(rowIndex)}
                  initial={{ opacity: 0 }} animate={{ opacity: 1 }} transition={{ duration: 0.5 }}>
                  {row.map((cell, cellIndex) => (
                    <td key={cellIndex} className="border border-orange-700 px-6 py-3 text-lg text-center">{cell}</td>
                  ))}
                </motion.tr>
              ))}
            </tbody>
          </table>
        </div>
        {selectedRow !== null && (
          <div className="mt-6 p-6 bg-teal-700 rounded-xl shadow-lg">
            <h4 className="text-xl font-semibold">Edit Row:</h4>
            {spreadsheetData[selectedRow].map((cell, index) => (
              <select key={index} className="block w-full p-3 mt-3 bg-teal-800 border border-orange-600 text-white rounded-lg">
                <option value={cell}>{cell}</option>
                <option value="Updated Value">Updated Value</option>
                <option value="Modified Data">Modified Data</option>
                <option value="New Entry">New Entry</option>
              </select>
            ))}
          </div>
        )}
      </motion.section>

      {/* Footer */}
      <motion.footer className="w-full py-8 bg-teal-800 text-center shadow-lg"
        initial={{ opacity: 0 }}
        animate={{ opacity: 1 }}>
        <p className="text-orange-300 text-lg">&copy; 2025 SheetPro. All rights reserved.</p>
      </motion.footer>
    </div>
  );
}
