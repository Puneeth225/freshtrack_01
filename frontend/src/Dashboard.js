import React, { useState } from "react";
import axios from "axios";

function Dashboard() {
  const [invoiceId, setInvoiceId] = useState("");
  const [sku, setSku] = useState("");

  const scan = async () => {
    await axios.post("http://localhost:8080/hub/scan", {
      invoiceId,
      sku,
      userId: 1
    });

    alert("Scanned");
  };

  return (
    <div>
      <h2>Scan Item</h2>
      <input placeholder="Invoice ID" onChange={e=>setInvoiceId(e.target.value)} />
      <input placeholder="SKU" onChange={e=>setSku(e.target.value)} />
      <button onClick={scan}>Scan</button>
    </div>
  );
}

export default Dashboard;