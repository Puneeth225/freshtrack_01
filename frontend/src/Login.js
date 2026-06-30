import React, { useState } from "react";
import axios from "axios";

function Login() {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const login = async () => {
    const res = await axios.post("http://localhost:8080/auth/login", {
      email,
      password
    });

    localStorage.setItem("token", res.data);
    alert("Login Successful");
  };

  return (
    <div>
      <h2>Login</h2>
      <input placeholder="email" onChange={e=>setEmail(e.target.value)} />
      <input placeholder="password" onChange={e=>setPassword(e.target.value)} />
      <button onClick={login}>Login</button>
    </div>
  );
}

export default Login;