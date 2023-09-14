import React, { useState, useEffect } from 'react';
import './App.css';

function App() {
  const [githubUsername, setGitHubUsername] = useState('');
  const [healthCheck, setHealthCheck] = useState('');

  useEffect(() => {
    // GitHub 계정 API 요청
    fetch(`http://localhost:3001/api/v1/kcs3378`)
      .then((response) => response.text())
      .then((data) => setGitHubUsername(data));


    // Healthcheck API 요청
    fetch('http://localhost:3001/healthcheck') 
      .then((response) => response.text())
      .then((data) => setHealthCheck(data));
  }, []);

  return (
    <div className="App">
      <h1>GitHub 계정 이름:</h1>
      <p>{githubUsername}</p>

      <h2>서비스 상태:</h2>
      <p>{healthCheck}</p>
    </div>
  );
}

export default App;
